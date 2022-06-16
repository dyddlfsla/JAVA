package chapter.test;

public class Computer {

  private String HDD;
  private String RAM;

  private boolean isGraphicCardEnabled;
  private boolean isBluetoothEnabled;

  public String getHDD() {
    return HDD;
  }

  public String getRAM() {
    return RAM;
  }

  public boolean isGraphicCardEnabled() {
    return isGraphicCardEnabled;
  }

  public boolean isBluetoothEnabled() {
    return isBluetoothEnabled;
  }

  private Computer(ComputerBuilder builder) {
    this.HDD = builder.HDD;
    this.RAM = builder.RAM;
    this.isGraphicCardEnabled = builder.isGraphicsCardEnabled;
    this.isBluetoothEnabled = builder.isBluetoothEnabled;
  }

  static class ComputerBuilder {

    private String HDD;
    private String RAM;

    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    public ComputerBuilder(String HDD, String RAM) {
      this.HDD = HDD;
      this.RAM = RAM;
    }

    public ComputerBuilder setGraphicCardEnabled(boolean isGraphicCardEnabled) {
      this.isGraphicsCardEnabled = isGraphicCardEnabled;
      return this;
    }

    public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
      this.isBluetoothEnabled = isBluetoothEnabled;
      return this;
    }

    public Computer build() {
      return new Computer(this);
    }
  }

  @Override
  public String toString() {
    return "HDD: " + this.HDD + ", RAM: " + this.RAM + ", graphicCard: " + this.isGraphicCardEnabled + ", Bluetooth: "+ this.isBluetoothEnabled;
  }
}

class BuilderPatternTest {

  public static void main(String[] args) {
    Computer computer = new Computer.ComputerBuilder("Intel", "32GB")
        .setGraphicCardEnabled(false)
        .setBluetoothEnabled(true)
        .build();

    System.out.println(computer);
  }
}


