package com.sumdev.tax.ars.auto.it;

import com.sumdev.tax.ars.auto.po.LoginPageObject;
import com.sumdev.tax.ars.auto.po.DashboardPageObject;
import com.sumdev.tax.ars.auto.po.LegalEntitiesListPageObject;
import com.sumdev.tax.ars.auto.po.CreateLegalEntityPageObject;
import com.sumdev.tax.ars.auto.po.ConfirmationPageObject;
import com.sumdev.tax.ars.arsauto.vo.LegalEntity;
import com.sumdev.tax.ars.arsauto.repo.ILegalEntityRepository;
import com.sumdev.tax.ars.arsauto.repo.LegalEntityOracleRepository;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.Assert;

public class AddLegalEntityIT {

	@DataProvider(name = "LegalEnityTestData")
	public Object[][] generateTestData() {
		System.out.println("AddLegalEntityIT|generateTestData");
		Object[][] legalEntityArray = { 
				{ "EN11026", "N-1026", 11026, 1026 },
				{ "EN11027" , "N-1027", 1027,  27}

		};

		return legalEntityArray;
	}

	public void setup() {
		System.out.println("AddLegalEntityIT|setup|");

	}

	@Test
	public void dummyIT() {
		System.out.println("AddLegalEntityIT|dummyIT|Inegration Test Add legal entity");

	}

	@Test(dataProvider = "LegalEnityTestData")
	public void verifyLEAdditon(String tmpEntityNumber, String tmpName, int tmpCapitalAmount, int tmpShareCount) {
		System.out.println("AddLegalEntityIT|verifyLEAdditon|");

		// Go To Login page : http://localhost:9090/admin)
		LoginPageObject loginpo = new LoginPageObject();

		// Provide ARS Login credenitials (Username : admin , Password:admin)
		// and Click on 'Log Me In' button
		// System will allow user to login to the system, will show dashboard
		// page.
		DashboardPageObject utdepo = loginpo.login("admin", "admin");
		System.out.println("AddLegalEntityIT|verifyLEAdditon|utdepo|" + utdepo);

		LegalEntitiesListPageObject lelpo = utdepo.navigateToLegalEntityList();
		System.out.println("AddLegalEntityIT|verifyLEAdditon|lelpo|" + lelpo);

		CreateLegalEntityPageObject clepo = lelpo.navigateToCreateNewPage();
		System.out.println("AddLegalEntityIT|verifyLEAdditon|clepo|" + clepo);

		LegalEntity expectedle = new LegalEntity(tmpEntityNumber, tmpName, tmpCapitalAmount, tmpShareCount);
		clepo.addNewLegalEntity(expectedle);
		System.out.println("AddLegalEntityIT|verifyLEAdditon|Compare|***************");
		// JDBC / Database
		ILegalEntityRepository lerepo = new LegalEntityOracleRepository();
		lerepo.open();
		LegalEntity observedle = lerepo.findByID(tmpEntityNumber);

		// Compare , Observed and verify
		boolean result = compare(observedle, expectedle);
		System.out.println("AddLegalEntityIT|verifyLEAdditon|Compare|*******" + result);

		// If result is true then Assert that testcase is pasesd
		// If result is false then it means comparision failled i..e Assert that
		// test case failed
		Assert.assertEquals(result, true);

	}

	private boolean compare(LegalEntity observedle, LegalEntity expectedle) {
		System.out.println("AddLegalEntityIT|verifyLEAdditon|compare|");

		boolean equalFlag = false;

		if (observedle.getEntityNumber().equals(expectedle.getEntityNumber())
				&& observedle.getName().equals(expectedle.getName())
				&& observedle.getCapitalAmount() == expectedle.getCapitalAmount()
				&& observedle.getShareCount() == expectedle.getShareCount()

		) {
			equalFlag = true;
		}
		
		System.out.println("AddLegalEntityIT|verifyLEAdditon|compare|equalFlag|"+equalFlag);
		
		return equalFlag;

	}

	public void cleanup() {
		// System.out.println("AddLegalEntityUT|cleanup|");

	}

	public static void main(String[] args) {

		System.out.println("AddLegalEntityIT|Main|");

		String tempEntityNumber = "EN-101051";
		int tempCapitalAmount = 10051;
		String tempName = "NAME-101051";
		int tempShareCount = 51;

		AddLegalEntityIT addle = new AddLegalEntityIT();
		addle.setup();
		addle.verifyLEAdditon(tempEntityNumber, tempName, tempCapitalAmount, tempShareCount);
		addle.cleanup();

	}

}
