package com.platform45.marsroverchallenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class MarsRoverChallengeApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MarsRoverChallengeApplication.class, args);

		Scanner scanner = new Scanner(System.in);
		Plateau plateau = null;
		List<MarsRover> marsRovers = new ArrayList<>();

		System.out.print("Please enter your commands\n");

		if (scanner.hasNextLine()) {
			String[] lineArray = scanner.nextLine().split(" ");
			plateau = new Plateau(new Integer(lineArray[0]), new Integer(lineArray[1]));
		}

		boolean isFinished = false;
		MarsRover marsRover = null;
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			if (line.isEmpty())
				break;
			if (!isFinished) {
				String[] lineArray = line.split(" ");
				marsRover = new MarsRover(plateau, new Integer(lineArray[0]), new Integer(lineArray[1]), lineArray[2]);
				isFinished = true;

			} else {
				marsRover.runCommands(line);
				marsRovers.add(marsRover);
				isFinished = false;
			}

		}

		scanner.close();
		System.out.print("\nResults\n");
		for (MarsRover marsRoverResult : marsRovers) {
			System.out.println(marsRoverResult.getCurrentX() + " " + marsRoverResult.getCurrentY() + " "
					+ marsRoverResult.getCurrentOrientation());
		}


	}
}
