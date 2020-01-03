package com.lemonlab.all_in_one.items

import android.app.AlertDialog
import android.content.Context
import android.widget.ImageView
import com.lemonlab.all_in_one.R
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.sticker_item_view.view.*

class StickerItem(var context: Context, private var action: (ImageView)-> Unit,
                  private var dialog:AlertDialog): Item<ViewHolder>(){
    override fun getLayout(): Int {
        return R.layout.sticker_item_view
    }

    override fun bind(viewHolder: ViewHolder, position: Int) {

        // select this image, and trigger the action
        // the action will pass this image view to the photo editor
        viewHolder.itemView.sticker_image_view.setOnClickListener {
            action.invoke(viewHolder.itemView.sticker_image_view)
            dialog.dismiss()
        }
    }

}
