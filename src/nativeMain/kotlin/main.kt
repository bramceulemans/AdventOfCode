import kotlin.time.ExperimentalTime

@ExperimentalTime
fun runSolution(day: Int, part: Int, callback: () -> Unit) {
    print("Running: day $day, part $part\n---\n")
    val duration = kotlin.time.measureTime(callback)
    print("---\nFinished: day $day, part $part in ${duration.inNanoseconds}µs\n\n")
}

@ExperimentalTime
fun main() {
//    runSolution(1, 1) { day1.part1() }
//    runSolution(1, 2) { day1.part2() }
//    runSolution(2, 1) { day2.part1() }
//    runSolution(2, 2) { day2.part2() }
//    runSolution(3, 1) { day3.part1() }
//    runSolution(3, 2) { day3.part2() }
//    runSolution(4, 1) { day4.part1() }
//    runSolution(4, 2) { day4.part2() }
//    runSolution(5, 1) { day5.part1() }
//    runSolution(5, 2) { day5.part2() }
//    runSolution(6, 1) { day6.part1() }
//    runSolution(6, 2) { day6.part2() }
//    runSolution(7, 1) { day7.part1() }
//    runSolution(7, 2) { day7.part2() }
    runSolution(8, 1) { day8.part1() }
//    runSolution(8, 2) { day8.part2() }
}
