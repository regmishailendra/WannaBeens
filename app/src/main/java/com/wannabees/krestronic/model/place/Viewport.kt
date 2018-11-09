package com.wannabees.krestronic.model.place

import com.activeandroid.annotation.Column
import com.google.gson.annotations.Expose

data class Viewport (
        @Expose @Column(name="sw")  var southwest: Southwest?,
        @Expose @Column(name="ne")  var northeast: Northeast?
)