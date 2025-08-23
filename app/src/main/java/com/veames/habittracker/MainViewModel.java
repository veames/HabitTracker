package com.veames.habittracker;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class MainViewModel extends ViewModel {

    private MutableLiveData<List<Habit>> habits = new MutableLiveData<>();

    public LiveData<List<Habit>> getHabits() {
        return habits;
    }

    public void loadHabits() {
        // Set value in MLD
    }

}
