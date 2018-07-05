package progressbar

import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider

class ProgressBar {
    var duration = 0
    var current = 0
    var done = false

    var clear = "_"
    var fill = ">"
    var edges = "[]"
    var length = 20
    var carriage_return = true
    var display_duration = false
    var units = ""
    var display_edges = true


    constructor(_duration: Int, _current: Int,_done: Boolean = false){
        this.duration = _duration
        this.current = _current
        this.done = _done
    }

    fun set_params(_clear: String = "_", _fill: String = ">", _edges: String = "[]", _length: Int = 20, _carriage_return: Boolean = true, _display_duration: Boolean = true, _units: String = "", _display_edges: Boolean = true) {
        this.clear = _clear
        this.fill = _fill
        assert(_edges.length == 2)
        this.edges = _edges
        this.length = _length
        this.carriage_return = _carriage_return
        this.display_duration = _display_duration
        this.units = _units
        this.display_duration = _display_duration
    }



    fun display() {
        var string_builder = ""
        var edge_start = this.edges[0]
        var edge_end = this.edges[1]
        var filled = ((this.current * this.length)/this.duration).toInt()

        if(this.display_duration == false) {

        }
        else {
            string_builder = string_builder + this.current.toString() + "/" + this.duration.toString() + this.units.toString() + " "
        }

        if(this.display_edges == true){
            string_builder = string_builder + edge_start
        }

        for(x in 0 .. filled){
            string_builder = string_builder + this.fill
        }

        for(x in filled .. this.length-1){
            string_builder = string_builder + this.clear
        }

        if(this.display_edges == true){
            string_builder = string_builder + edge_end
        }

        if(this.carriage_return == false) {
            print(string_builder)
        }
        else {
            print("\r" + string_builder)
        }
    }

    fun next(){
        this.current = this.current + 1
        this.display()
    }
}