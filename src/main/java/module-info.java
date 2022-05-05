module ru.muctr.week11 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.muctr.week11 to javafx.fxml;
    exports ru.muctr.week11;
}