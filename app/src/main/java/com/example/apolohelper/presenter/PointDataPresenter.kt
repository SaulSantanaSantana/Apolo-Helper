package com.example.apolohelper.presenter

import com.example.apolohelper.model.AuthModelInterface
import com.example.apolohelper.ui.PointDataActivity
import com.example.apolohelper.ui.login.ProfileActivity

class PointDataPresenter {
    private val view: PointDataActivity
    private val model: AuthModelInterface
    constructor(view: PointDataActivity, model: AuthModelInterface) {
        this.view = view
        this.model = model
    }
}