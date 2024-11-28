package homework_21.task_2;

public class Computer {
    private Processor processor; //
    private Memory memory; //
    private Storage storage; //

    public Computer(Storage storage, String procBrand, String procModel) {
        this.storage = storage;
        this.processor = new Processor(procBrand, procModel);
        this.memory = new Memory("Crutial", "DDR-5400");
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }
}

