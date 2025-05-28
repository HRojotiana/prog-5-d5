public class PowerSupply {
    protected boolean powered;

    public PowerSupply(){
        this.powered = false;
    }

    public boolean turn_on(){
        this.powered = true;
        return this.powered;
    }

    public boolean is_powered(){
        if(!turn_on()) {
            throw new RuntimeException("Power outage");
        }
        return true;
    }

    @Override
    public String toString() {
        return "PowerSupply{" +
                "powered=" + powered +
                '}';
    }
}
