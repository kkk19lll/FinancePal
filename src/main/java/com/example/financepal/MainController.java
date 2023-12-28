package com.example.financepal;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.financepal.db.DbFunctions;
import com.example.financepal.db.Variables;
import com.example.financepal.models.Investment;
import com.example.financepal.models.Wallet;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
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
    private Button btnInvestment;

    @FXML
    private Button btnStatistics;

    @FXML
    private Button btnWallet;

    Wallet wallet;

    Investment investment;

    private final DbFunctions dbFunctions = new DbFunctions();

    @FXML
    void initialize() {
        if (Variables.ACTIVE_USER_ROLE.equals("user")) {
            addWallet.setVisible(false);
            deleteWallet.setVisible(false);
            updateWallet.setVisible(false);
        }
        installTableViewWallet();
        installTableViewInvestment();
        btnWallet.setOnAction(e -> {
            walletAnchorPane.setVisible(true);
            investmentsAnchorPane.setVisible(false);
            statisticsAnchorPane.setVisible(false);
        });

        btnInvestment.setOnAction(e -> {
            walletAnchorPane.setVisible(false);
            investmentsAnchorPane.setVisible(true);
            statisticsAnchorPane.setVisible(false);
        });

        btnStatistics.setOnAction(e -> {
            walletAnchorPane.setVisible(false);
            investmentsAnchorPane.setVisible(false);
            statisticsAnchorPane.setVisible(true);
        });


    }

    private void installTableViewWallet() {
        idWalletTableColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameWalletTableColumn.setCellValueFactory(new PropertyValueFactory<>("name_wallet"));
        moneyWalletTableColumn.setCellValueFactory(new PropertyValueFactory<>("money_wallet"));
        userWalletTableColumn.setCellValueFactory(new PropertyValueFactory<>("user_id"));

        tableViewWallet.setItems(dbFunctions.getAllWallets());
    }

    private void installTableViewInvestment() {
        idInvestmentsTableColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameInvestmentsTableColumn.setCellValueFactory(new PropertyValueFactory<>("name_investment"));
        descriptionInvestmentsTableColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
        priceIvestmentsTableColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

        tableViewInvetsments.setItems(dbFunctions.getAllInvestments());
    }

}
