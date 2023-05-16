package com.ezbits.acapp.data.model

import java.net.URL

class User{
    private var displayName: String
    private var uuid: String
    private var prfileImgUrl: URL
    private var status: Boolean = false
    private var trainningTable = arrayListOf<Ttable>()

    constructor(displayName: String, uuid: String, prfileImgUrl: URL, status: Boolean,
                trainningTable: Ttable) {
        this.displayName = displayName
        this.uuid = uuid
        this.prfileImgUrl = prfileImgUrl
        this.status = status
        this.trainningTable = arrayListOf (trainningTable)
    }


}
