package com.example.financepal;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.financepal.models.Investment;
import com.example.financepal.models.Wallet;
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
    private TableColumn<Wallet, String> idWalletTableColumn;

    @FXML
    private AnchorPane investmentsAnchorPane;

    @FXML
    private AnchorPane mainAnchorPane;

    @FXML
    private TableColumn<Wallet, String> moneyWalletTableColumn;

    @FXML
    private TableColumn<Investment, String> nameInvestmentsTableColumn;

    @FXML
    private TableColumn<Wallet, String> nameWalletTableColumn;

    @FXML
    private PieChart pieChartStatistics;

    @FXML
    private TableColumn<Investment, String> priceIvestmentsTableColumn;

    @FXML
    private AnchorPane statisticsAnchorPane;

    @FXML
    private TableView<Investment> tableViewInvetsments;

    @FXML
    private TableView<Wallet> tableViewWallet;

    @FXML
    private ImageView updateWallet;

    @FXML
    private TableColumn<Wallet, String> userWalletTableColumn;

    @FXML
    private AnchorPane walletAnchorPane;

    @FXML
    void initialize() {

    }

}
