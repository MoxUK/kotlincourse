package module2.util.FigureMathUtil
import module2.entity.Figure

class FigureMathUtil {
    fun getArea(figure: Figure): Double {
        return figure.area()
    }

    fun getPerimeter(figure: Figure): Double    {
        return figure.perimeter()
    }
}