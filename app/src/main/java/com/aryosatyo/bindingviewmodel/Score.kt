package com.aryosatyo.bindingviewmodel

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class Score: BaseObservable() {
    var teamA: Int = 0
        @Bindable get
        set(value) {
            field = value
            notifyPropertyChanged(BR.teamA)
        }
    var teamB: Int = 0
        @Bindable get
        set(value) {
            field = value
            notifyPropertyChanged(BR.teamB)
        }
}