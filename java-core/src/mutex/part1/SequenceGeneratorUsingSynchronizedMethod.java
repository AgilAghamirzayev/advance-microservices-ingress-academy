package mutex.part1;

public class SequenceGeneratorUsingSynchronizedMethod extends SequenceGenerator {
    
    @Override
    public synchronized int getNextSequence() {
        return super.getNextSequence();
    }

}