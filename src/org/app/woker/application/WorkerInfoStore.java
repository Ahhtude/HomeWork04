package org.app.woker.application;

import org.app.woker.entities.Manager;
import org.app.woker.entities.Programmer;
import org.app.woker.entities.QAEngineer;
import org.app.woker.entities.Worker;

import java.util.Arrays;


public final class WorkerInfoStore {

    private static WorkerInfoStore instance = new WorkerInfoStore();

    private WorkerInfoStore() {
    }

    public static WorkerInfoStore getInstance() {
        return instance;
    }

    private static final int initialSizeForArrays = 10;

    private Manager[] managers = new Manager[initialSizeForArrays];
    private Programmer[] programmers = new Programmer[initialSizeForArrays];
    private QAEngineer[] qaEngineers = new QAEngineer[initialSizeForArrays];

    private int managersCount;
    private int programmersCount;
    private int qaEngineersCount;

    public void addMeneger(Manager manager) {
        if (managers.length <= managersCount) {
            managers[managersCount] = manager;
            managersCount += 1;
        } else {
            managers = Arrays.copyOf(managers, managers.length + 10);
            managers[managersCount] = manager;
            managersCount += 1;
        }
    }

    public void addProgrammer(Programmer programmer) {
        if (programmers.length <= programmersCount) {
            programmers[programmersCount] = programmer;
            programmersCount += 1;
        } else {
            programmers = Arrays.copyOf(programmers, programmers.length + 10);
            programmers[programmersCount] = programmer;
            programmersCount += 1;
        }

    }

    public void addQAengineers(QAEngineer qaEngineer) {
        if (qaEngineers.length <= qaEngineersCount) {
            qaEngineers[qaEngineersCount] = qaEngineer;
            qaEngineersCount += 1;
        } else {
            qaEngineers = Arrays.copyOf(qaEngineers, qaEngineers.length + 10);
            qaEngineers[qaEngineersCount] = qaEngineer;
            qaEngineersCount += 1;
        }
    }

    public void addWorker(Worker worker) {
        if (worker instanceof Manager) {
            addMeneger((Manager) worker);
        } else if (worker instanceof Programmer) {
            addProgrammer((Programmer) worker);
        } else if (worker instanceof QAEngineer) {
            addQAengineers((QAEngineer) worker);
        }
    }

}
