package com.rivan.ujianitrivan.base

interface BasePresenter<in T: BaseView> {
    fun onAttach(view: T)
    fun onDetach()
}