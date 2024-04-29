// write code to write 10000000 line to a file
// each line should contain a random number between 1 to 1000

package main

import (
	"fmt"
	"os"
	"strconv"
	"time"
)

func main() {
	f, err := os.Create("random_text_go.txt")
	if err != nil {
		fmt.Println(err)
		return
	}
	defer f.Close()

	start_time := time.Now().UnixNano()

	fmt.Println("Writing to file")

	for i := 0; i < 10000000; i++ {
		f.WriteString("line " + strconv.Itoa(i))
	}

	end_time := time.Now().UnixNano()

	fmt.Println("Time taken to write 10000000 lines to file: ", (end_time-start_time)/1000000, "ms")
}
