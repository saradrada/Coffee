package com.coffee.common;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import commandExecutor.CmdExecutor;

class CmdExecutorTest {

	@Test
	void testRun() {
		
		CmdExecutor executor= new CmdExecutor();
		List<String> params= new ArrayList<String>();
		params.add("ls");
		params.add("-la");
		executor.addCmd(params);
		try {
			executor.runCmd();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
