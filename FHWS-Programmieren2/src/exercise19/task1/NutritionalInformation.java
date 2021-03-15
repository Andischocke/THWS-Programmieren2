package exercise19.task1;

public class NutritionalInformation {

	private int portionSize;
	private int portionQuantity;

	private int protein;
	private int fat;
	private int carbohydrates;
	private int sodium;

	private NutritionalInformation(Builder builder) {
		this.portionSize = builder.portionSize;
		this.portionQuantity = builder.portionQuantity;
		this.protein = builder.protein;
		this.fat = builder.fat;
		this.carbohydrates = builder.carbohydrates;
		this.sodium = builder.sodium;
	}

	public static class Builder {

		private int portionSize;
		private int portionQuantity;

		private int protein;
		private int fat;
		private int carbohydrates;
		private int sodium;

		public Builder(int portionSize, int portionQuantity) {
			this.portionSize = portionSize;
			this.portionQuantity = portionQuantity;
		}

		public Builder withProtein(int protein) {
			this.protein = protein;
			return this;
		}

		public Builder withFat(int fat) {
			this.fat = fat;
			return this;
		}

		public Builder withCarbohydrates(int carbohydrates) {
			this.carbohydrates = carbohydrates;
			return this;
		}

		public Builder withSodium(int sodium) {
			this.sodium = sodium;
			return this;
		}

		public NutritionalInformation build() {
			return new NutritionalInformation(this);
		}
	}

	public String toString() {
		String string = String.format("NutritionalInformation: %dg x %d\n", portionSize, portionQuantity);
		string += (protein != 0) ? String.format("Protein: %dg\t", protein) : "";
		string += (fat != 0) ? String.format("Fat: %dg\t", fat) : "";
		string += (carbohydrates != 0) ? String.format("Carbonhydrates: %dg\t", carbohydrates) : "";
		string += (sodium != 0) ? String.format("Sodium: %dg\t", sodium) : "";
		return string;
	}

	public static void main(String[] args) {
		NutritionalInformation n = new Builder(500, 4)
				.withProtein(100)
				.withFat(2)
				.withCarbohydrates(10)
				.withSodium(10)
				.build();
		System.out.println(n);
	}
}