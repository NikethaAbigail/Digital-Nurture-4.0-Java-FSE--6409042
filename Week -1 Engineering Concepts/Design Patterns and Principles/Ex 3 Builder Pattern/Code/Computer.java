package builder;

public class Computer {
    private final String cpu;
    private final int ram;
    private final int storage;
    private final boolean hasGraphicsCard;
    private final boolean hasSSD;

    // Private constructor to be called by Builder
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.hasGraphicsCard = builder.hasGraphicsCard;
        this.hasSSD = builder.hasSSD;
    }

    
    public static class Builder {
        private String cpu;
        private int ram;
        private int storage;
        private boolean hasGraphicsCard;
        private boolean hasSSD;

        
        public Builder(String cpu, int ram, int storage) {
            this.cpu = cpu;
            this.ram = ram;
            this.storage = storage;
        }

        
        public Builder setGraphicsCard(boolean hasGraphicsCard) {
            this.hasGraphicsCard = hasGraphicsCard;
            return this;
        }

        public Builder setSSD(boolean hasSSD) {
            this.hasSSD = hasSSD;
            return this;
        }

        
        public Computer build() {
            return new Computer(this);
        }
    }

    
    public String getCpu() {
        return cpu;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public boolean hasGraphicsCard() {
        return hasGraphicsCard;
    }

    public boolean hasSSD() {
        return hasSSD;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + cpu + ", RAM=" + ram + "GB, Storage=" + storage + "GB, GraphicsCard=" + hasGraphicsCard +
               ", SSD=" + hasSSD + "]";
    }
}