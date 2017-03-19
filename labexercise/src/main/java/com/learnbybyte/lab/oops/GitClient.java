package com.learnbybyte.lab.oops;

/**
 * @author bhamamo
 *
 */
public interface GitClient {

public void cloneRepository(String souceURL, String destinationFolder);

public void commit();

public void stagefiles();

public void push();

public void pull();

	
}
