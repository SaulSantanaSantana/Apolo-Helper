package com.example.apolohelper.presenter

import com.example.apolohelper.model.AuthModelInterface
import com.example.apolohelper.ui.Table30Activity
import com.example.apolohelper.ui.Table36Activity

class Table30Presenter {
    private val view: Table30Activity
    private val model: AuthModelInterface

    constructor(view: Table30Activity, model: AuthModelInterface) {
        this.view = view
        this.model = model
    }
}