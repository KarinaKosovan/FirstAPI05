package it.develhope.FirstAPI05;

import javax.validation.constraints.NotBlank;

public class CarDTO {

    @NotBlank(message = "Mandatory")
    private final String id;

    @NotBlank(message = "Mandatory")
    private final String modelName;

    private final double price;

    public CarDTO(String id, String modelName, double price) {
        this.id = id;
        this.modelName = modelName;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getModelName() {
        return modelName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "CarDTO{" +
                "id='" + id + '\'' +
                ", modelName='" + modelName + '\'' +
                ", price=" + price +
                '}';
    }
}
