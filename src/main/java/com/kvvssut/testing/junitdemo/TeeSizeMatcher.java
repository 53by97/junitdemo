package com.kvvssut.testing.junitdemo;

public class TeeSizeMatcher {

	public String getTeeSize(int heightInCms, int chestSizeInCms) {
		final int[] heightRange = getHeightRange(heightInCms);
		final double chestAdjustFactor = getChestAdjustFactor(chestSizeInCms);

		final double approxSize = (heightRange[0]
				+ (((heightInCms - heightRange[0]) / (heightRange[1] - heightRange[0])) * heightInCms))
				* chestAdjustFactor;

		return matchedTeeSize(approxSize);
	}

	private int[] getHeightRange(int heightInCms) {
		int[] range = new int[2];

		if (heightInCms < 100) {
			range[0] = 0;
			range[1] = 100;
		} else if (heightInCms < 150) {
			range[0] = 100;
			range[1] = 150;
		} else if (heightInCms < 175) {
			range[0] = 150;
			range[1] = 175;
		} else {
			range[0] = 175;
			range[1] = 250;
		}

		return range;
	}

	private double getChestAdjustFactor(int chestSizeInCms) {
		double adjustFactor = 0;

		if (chestSizeInCms < 30) {
			adjustFactor = 1;
		} else if (chestSizeInCms < 40) {
			adjustFactor = 1.2;
		} else {
			adjustFactor = 1.5;
		}

		return adjustFactor;
	}

	private String matchedTeeSize(double approxSize) {
		String size = "";

		if (approxSize < 120) {
			size = "S";
		} else if (approxSize < 150) {
			size = "M";
		} else if (approxSize < 180) {
			size = "L";
		} else {
			size = "XL";
		}

		return size;
	}

}
