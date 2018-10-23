module Cows.and.bulls {
    requires javafx.controls;
    requires javafx.fxml;
    exports cap to javafx.graphics, javafx.fxml;
    opens cap to javafx.fxml,javafx.base;

}