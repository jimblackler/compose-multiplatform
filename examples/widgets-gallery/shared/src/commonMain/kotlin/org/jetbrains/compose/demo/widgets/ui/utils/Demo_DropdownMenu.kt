package org.jetbrains.compose.demo.widgets.ui.utils

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun Demo_DropDownMenu() {
    var expanded by remember { mutableStateOf(false) }

    Box(Modifier.fillMaxWidth().wrapContentSize(Alignment.BottomEnd)) {
        IconButton(onClick = { expanded = !expanded }) {
            Icon(Icons.Default.MoreVert, "More")
        }

        DropdownMenu(expanded, { expanded = false }) {
            DropdownMenuItem({ expanded = false }) {
                Text("Load")
            }
            DropdownMenuItem(onClick = { expanded = false }) {
                Text("Save")
            }
        }
    }
}