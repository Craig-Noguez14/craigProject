package com.InfinityTides.petfinder.ui.main;

import com.InfinityTides.petfinder.data.model.Ribot;
import com.InfinityTides.petfinder.ui.base.MvpView;

import java.util.List;

public interface MainMvpView extends MvpView {

    void showRibots(List<Ribot> ribots);

    void showRibotsEmpty();

    void showError();

}
