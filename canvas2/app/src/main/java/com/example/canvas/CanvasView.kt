// CanvasView.kt
package com.example.canvas

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View

class CanvasView(context: Context, attrs: AttributeSet) : View(context, attrs) {

    private val rectanglePaint = Paint()
    private val ovalPaint = Paint()
    private val trianglePaint = Paint()

    init {
        rectanglePaint.color = Color.BLUE
        ovalPaint.color = Color.RED
        trianglePaint.color = Color.GREEN  // Set the color to green for the triangle, for example
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        // Draw Rectangle
        val rectLeft = 300f
        val rectTop = 1000f
        val rectRight = 800f
        val rectBottom = 1200f
        canvas.drawRect(rectLeft, rectTop, rectRight, rectBottom, rectanglePaint)

        // Draw Oval
        val ovalLeft = 500f
        val ovalTop = 100f
        val ovalRight = 800f
        val ovalBottom = 300f
        canvas.drawOval(ovalLeft, ovalTop, ovalRight, ovalBottom, ovalPaint)

        // Draw Triangle
        val path = Path()
        path.moveTo(600f, 700f)  // Starting point (x, y)
        path.lineTo(500f, 300f)  // Second point (x, y)
        path.lineTo(700f, 300f)  // Third point (x, y)
        path.close()            // Close the path to form a closed triangle

        // Draw the triangle on the canvas
        canvas.drawPath(path, trianglePaint)
    }
}
