package org.app.woker.entities;

/*
 * Class for representation info about manager.
 *
 * @author alitvinov
 */
public class Manager extends Worker {
    private String project;
    private int expirience;

    @Override
    public String getWorkerPosition() {
        return super.getWorkerPosition() + "is Manager";
    }
}
