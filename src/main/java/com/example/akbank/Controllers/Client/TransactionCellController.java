package com.example.akbank.Controllers.Client;

import com.example.akbank.Models.Transaction;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class TransactionCellController implements Initializable {
    public Label trans_date_lbl;
    public Label sender_lbl;
    public Label reciever_lbl;
    public Label amount_lbl;

    private final Transaction transaction;

    public TransactionCellController(Transaction transaction) {
        this.transaction = transaction;
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
