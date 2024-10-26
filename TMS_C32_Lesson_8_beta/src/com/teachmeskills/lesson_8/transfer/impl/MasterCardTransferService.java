package com.teachmeskills.lesson_8.transfer.impl;

import com.teachmeskills.lesson_8.model.card.BaseCard;
import com.teachmeskills.lesson_8.model.document.Check;
import com.teachmeskills.lesson_8.transfer.CardTransferService;

import java.util.Date;

public class MasterCardTransferService implements CardTransferService {

    @Override
    public Check transferFromCardToCard(BaseCard cardFrom, BaseCard cardTo, double sumOfTransfer) {
        if (cardFrom.checkCardLimitTransfer(sumOfTransfer)) {
            return new Check(sumOfTransfer, new Date(), cardFrom);
        }
        return null;
    }

    @Override
    public Check transferFromCardToAccount(BaseCard cardFrom, BaseCard cardTo, double sumOfTransfer) {
        if (cardFrom.checkCardLimitTransfer(sumOfTransfer)) {
            return new Check(sumOfTransfer, new Date(), cardTo);
        }
        return null;
    }

}
