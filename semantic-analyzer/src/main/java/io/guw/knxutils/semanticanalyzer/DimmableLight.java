package io.guw.knxutils.semanticanalyzer;

import io.guw.knxutils.knxprojectparser.GroupAddress;

public class DimmableLight extends Light {

	private final GroupAddress dimGa;
	private final GroupAddress brightnessGa;
	private final GroupAddress brightnessStatusGa;

	public DimmableLight(String name, GroupAddress ga, GroupAddress statusGa, GroupAddress dimGa,
			GroupAddress brightnessGa, GroupAddress brightnessStatusGa) {
		super(name, ga, statusGa);
		this.dimGa = dimGa;
		this.brightnessGa = brightnessGa;
		this.brightnessStatusGa = brightnessStatusGa;
	}

	public GroupAddress getBrightnessGa() {
		return brightnessGa;
	}

	public GroupAddress getBrightnessStatusGa() {
		return brightnessStatusGa;
	}

	public GroupAddress getDimGa() {
		return dimGa;
	}

	@Override
	public String toString() {
		return "DimmableLight (" + getPrimarySwitchGroupAddress() + ", status: " + getStatusGroupAddress() + ", dim: "
				+ dimGa + ", brightness: " + brightnessGa + ", brightnessStatus: " + brightnessStatusGa + ")";
	}

}
