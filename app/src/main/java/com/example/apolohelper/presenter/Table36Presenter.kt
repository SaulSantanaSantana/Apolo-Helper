package com.example.apolohelper.presenter

import com.example.apolohelper.model.AuthModelInterface
import com.example.apolohelper.ui.Table36Activity

public class Table36Presenter {

    private val view: Table36Activity
    private val model: AuthModelInterface

    constructor(view: Table36Activity, model: AuthModelInterface) {
        this.view = view
        this.model = model
    }

}