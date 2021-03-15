package exercise16.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestSphereVolume {
	
	@Test
	public void testKugelvolumen0() {
		assertEquals(0.00, SphereVolume.calculateSphereVolume(0), 0.01);
	}
	
	@Test
	public void testKugelvolumen1() {
		assertEquals(4.19, SphereVolume.calculateSphereVolume(1), 0.01);
	}
	
	@Test
	public void testKugelvolumen2() {
		assertEquals(4.19, SphereVolume.calculateSphereVolume(-1), 0.01);
	}
	
	@Test
	public void testKugelvolumen3() {
		assertEquals(523.60, SphereVolume.calculateSphereVolume(5), 0.01);
	}
}