package org.app.woker.entities;

/*
 * Class for representation info about QA engineer.
 *
 * @author alitvinov
 */
public class QAEngineer extends Worker{
    private boolean automationQA;

    @Override
    public String getWorkerPosition() {
        return super.getWorkerPosition() + "is QAEngineer";
    }
}
