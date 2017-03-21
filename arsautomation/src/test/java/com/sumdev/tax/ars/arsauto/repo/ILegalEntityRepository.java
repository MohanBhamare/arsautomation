package com.sumdev.tax.ars.arsauto.repo;
import com.sumdev.tax.ars.arsauto.vo.LegalEntity;

public interface ILegalEntityRepository {

public void open();

public void insert(LegalEntity le);

public LegalEntity findByID(String tmpEntityId);


public void close();

	
}
