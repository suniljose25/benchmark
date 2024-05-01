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
	lines := 10_000_000

	start_time := time.Now().UnixNano()

	f, err := os.CreateTemp("", "random_text_go.txt")
	if err != nil {
		fmt.Println(err)
		return
	}
	defer f.Close()

	fmt.Print("Go: Writing to file...")

	for i := 0; i < lines; i++ {
		f.WriteString("line " + strconv.Itoa(i))
	}

	end_time := time.Now().UnixNano()

	fmt.Printf("\rGo: Time taken to write %v lines to file: %vms\n", lines, (end_time-start_time)/1000000)
}
