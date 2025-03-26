package desginpattern.solid;

abstract class Worker{
    public abstract double calculateSalary();
}

class FullTimeWorker extends Worker{

    @Override
    public double calculateSalary() {
        return 5000.0;
    }
}

class PartTimeWorker extends Worker{

    @Override
    public double calculateSalary() {
        return 2000.0;
    }
}
class SalaryCalculator{
    double calculateSalary(Worker worker){
        return worker.calculateSalary();
    }
}

/**
 *  Left side always try to use Interface
 *  Right side always try to use implementation
 *  and in methods you might always wait come to interface instead of concrete implementation
 *  this is calls Liskov Substitution Principle
 */


public class LiskovExample {
    public static void main(String[] args) {
        Worker fullTimeWorker = new FullTimeWorker();
        Worker partTimeWorker = new PartTimeWorker();

        SalaryCalculator salaryCalculator = new SalaryCalculator();

        System.out.println("Full time worker " + salaryCalculator.calculateSalary(fullTimeWorker));
        System.out.println("Part time worker " + salaryCalculator.calculateSalary(partTimeWorker));
    }
}
