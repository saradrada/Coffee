package commandExecutor;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executors;

/**
 * For executing calls in the console
 * 
 * @author Angela Villota
 * @version coffee V1 January 2019
 */

public class CmdExecutor {
	private static final String EXECUTION_PATH = "COFFEE_EXECUTION_PATH";
	private boolean isWindows = System.getProperty("os.name").toLowerCase().startsWith("windows");
	private boolean isEnvrVariable;
	public String directory;
	private ProcessBuilder processBuilder;

	public CmdExecutor() {

//		System.out.println(System.getenv(EXECUTION_PATH));		
		processBuilder = new ProcessBuilder();
		processBuilder.directory(new File(System.getenv(EXECUTION_PATH)));
		isEnvrVariable = true;
	}

	public CmdExecutor(String executionPath) {

		processBuilder = new ProcessBuilder();
		processBuilder.directory(new File(executionPath));

	}

	public void addCmd(List<String> params) {
		if (isEnvrVariable) {
			processBuilder.command(params);

		} else {
			if (isWindows) {
				processBuilder.command("cmd.exe", "/c", "dir");
			} else {
				processBuilder.command("sh", "-c", "ls");
			}

		}
	}

	public void runCmd() throws Exception {
		Process process = processBuilder.start();
		StreamGobbler streamGobbler = new StreamGobbler(process.getInputStream(), System.out::println);
		Executors.newSingleThreadExecutor().submit(streamGobbler);
		int exitCode = process.waitFor();
		assert exitCode == 0;
	}

}
