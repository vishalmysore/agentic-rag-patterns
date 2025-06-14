package client;

import com.t4a.processor.AIProcessingException;
import io.github.vishalmysore.debug.DebugCurlCommands;

import java.util.Map;

public class GenerateCurlCommands {
    public static void main(String[] args) throws AIProcessingException {
        Map<String,String>  commands = DebugCurlCommands.getCurlCommands(args);
        if (commands.isEmpty()) {
            System.out.println("No curl commands generated. Please check the input arguments.");
        } else {
            System.out.println("Generated curl commands:");
            commands.forEach((key, value) -> System.out.println(key + ": " + value));
        }
    }
}
