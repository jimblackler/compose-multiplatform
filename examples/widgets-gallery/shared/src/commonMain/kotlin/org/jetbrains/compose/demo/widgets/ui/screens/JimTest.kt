package org.jetbrains.compose.demo.widgets.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import org.jetbrains.compose.demo.widgets.ui.WidgetsType
import org.jetbrains.compose.demo.widgets.ui.utils.Demo_DropDownMenu
import org.jetbrains.compose.demo.widgets.ui.utils.TextTabs

@Composable
fun JimTest() {
    Column(Modifier.testTag(WidgetsType.JIM_TEST.testTag)) {

        Demo_DropDownMenu()
        Divider()
        TextTabs()
        Divider()
    }
}