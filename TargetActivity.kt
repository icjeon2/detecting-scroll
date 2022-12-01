var oldY: Float = 0.toFloat()
targetView.setOnTouchListener { v, event ->
    when (event.action) {
        MotionEvent.ACTION_DOWN -> {
            oldY = event.y
        }

        MotionEvent.ACTION_MOVE -> {
            if (event.y > oldY) {
                // scroll down, contents moves up
                
            }

            if (event.y < oldY) {
                // scroll up, contents moves down
            }
        }
        else -> {
        }
    }
    false

}
