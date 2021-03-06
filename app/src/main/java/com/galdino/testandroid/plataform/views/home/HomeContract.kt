package com.galdino.testandroid.plataform.views.home

import com.galdino.testandroid.mvp.Contract

interface HomeContract
{
    interface View: Contract.View{
        fun inflateInvestment()
        fun inflateContact()

    }
    interface Presenter: Contract.Presenter<View>{
        fun onInvestmentClicked()
        fun onContactClicked()
    }
}