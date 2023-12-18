public class _4_Student {
    String name;
    int programmingMark;
    int logicMark;
    char labGrade;

    _4_Student(String name, int programmingMark, int logicMark, char labGrade) {
        this.name = name;
        this.programmingMark = programmingMark;
        this.logicMark = logicMark;
        this.labGrade = labGrade;
    }

    String getName() {
        return name;
    }

    int getProgrammingMark() {
        return programmingMark;
    }

    int getLogicMark() {
        return logicMark;
    }

    char getLabGrade() {
        return labGrade;
    }

    public static boolean isStronger(_4_Student student1, _4_Student student2) {
        if (student1.getProgrammingMark() > student2.getProgrammingMark()) {
            return true;
        } 
        else if (student1.getProgrammingMark() < student2.getProgrammingMark()) {
            return false;
        }

        if (student1.getLogicMark() > student2.getLogicMark()) {
            return true;
        } else if (student1.getLogicMark() < student2.getLogicMark()) {
            return false;
        }

        return student1.getLabGrade() < student2.getLabGrade();
    }

    public static void main(String[] args) {
        // Example usage
        _4_Student student1 = new _4_Student("John", 90, 80, 'B');
        _4_Student student2 = new _4_Student("Alice", 95, 80, 'A');

        if (isStronger(student1, student2)) {
            System.out.println(student1.getName() + " is stronger than " + student2.getName());
        } else {
            System.out.println(student2.getName() + " is stronger than " + student1.getName());
        }
    }
}
