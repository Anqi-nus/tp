package seedu.command.student;

import seedu.student.StudentList;
import seedu.command.Command;
import seedu.exception.PACException;
import seedu.ui.UI;

import static seedu.pac.PAC.studentListCollection;

/**
 * Class representing a student related command to sort all studentList by alphabetical order.
 */
public class SortStudentListByList extends Command {

    protected StudentList studentList;
    private UI ui = new UI();

    /**
     * Method to sort all student list in studentListCollection alphabetically.
     */
    private void sort() {
        for (int i = 0; i < studentListCollection.size(); i++) {
            studentListCollection.get(i).sortAscending();
        }
    }

    @Override
    public void execute() throws PACException {
        sort();
        ui.displayMessage("StudentList sorted by name within the lists");
    }
}
