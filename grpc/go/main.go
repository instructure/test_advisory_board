package main

import (
	"log"
	"google.golang.org/grpc"
	"golang.org/x/net/context"
	"./soseedy"
)

const address = "localhost:50051"

func main() {
	conn, err := grpc.Dial(address, grpc.WithInsecure())
	if err != nil {
		log.Fatalf("failed to connect: %v", err)
	}
	defer conn.Close()
	c := soseedy.NewSoSeedyClient(conn)

	teacher, err := c.CreateTeacher(context.Background(), &soseedy.CreateTeacherRequest{})
	if err != nil {
		log.Fatalf("CreateTeacher failed: %v", err)
	}

	log.Printf("Teacher id: %s", teacher.Id)
	log.Printf("Teacher loginId: %s", teacher.Username)
	log.Printf("Teacher name: %s", teacher.Name)
}
