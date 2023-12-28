package com.example.financepal;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class MainController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView addWallet;

    @FXML
    private ImageView deleteWallet;

    @FXML
    private TableColumn<?, ?> descriptionInvestmentsTableColumn;

    @FXML
    private TableColumn<?, ?> idInvestmentsTableColumn;

    @FXML
    private TableColumn<?, ?> idWalletTableColumn;

    @FXML
    private AnchorPane investmentsAnchorPane;

    @FXML
    private AnchorPane mainAnchorPane;

    @FXML
    private TableColumn<?, ?> moneyWalletTableColumn;

    @FXML
    private TableColumn<?, ?> nameInvestmentsTableColumn;

    @FXML
    private TableColumn<?, ?> nameWalletTableColumn;

    @FXML
    private PieChart pieChartStatistics;

    @FXML
    private TableColumn<?, ?> priceIvestmentsTableColumn;

    @FXML
    private AnchorPane statisticsAnchorPane;

    @FXML
    private TableView<?> tableViewInvetsments;

    @FXML
    private TableView<?> tableViewWallet;

    @FXML
    private ImageView updateWallet;

    @FXML
    private TableColumn<?, ?> userWalletTableColumn;

    @FXML
    private AnchorPane walletAnchorPane;

    @FXML
    void initialize() {

    }

}
