#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

//Global Variables
bool flag = false;//Menu
int option = 0;//Switch Case
struct Node* head;
struct Node* last = NULL;
//char contact[4][10] = {"Code","Name","Age","Phone"};

int code = 0;
char name[10];
int age = 0;
int phone = 0;

int new_Code = 0;
char new_Name[10];
int new_Age = 0;
int new_Phone = 0;


struct Node  {

	int code;
	char name[10];
	int age;
	int phone;

	struct Node* next;
	struct Node* prev;
};


struct Node* new_node(int code, char name,int age,int phone){

  struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));

  newNode->code=code;
  newNode->name[10]=name;
  newNode->age =age;
  newNode->phone =phone;

  newNode->prev = NULL;
  newNode->next = NULL;
  return newNode;
}

bool isEmpty(){
  return head == NULL;
}

void addFront(int code, char name,int age,int phone){
    struct Node* newNode = new_node(code, name, age, phone);//Constructor
    if(isEmpty()){//Check if List is Empty
          head = newNode;
          return;
    }
    head->prev = newNode;
    newNode->next =head;
    head =newNode;
}

void addBack(int code, char name,int age,int phone){
  struct Node* current = head;
  struct Node* newNode = new_node(code, name, age, phone);
  if(isEmpty()){
    head = newNode;
    return;
  }
  while(current->next !=NULL) current = current->next;
    current->next = newNode;
    newNode->prev = current;

}
void removeFromList(int code){

   struct Node* current = head;
   struct Node* previous = NULL;

   if(isEmpty()) {
        printf("The List Is Empty");
        option = 0;
    }
    //Search the Code
   while(current->code != code) {

      if(current->next == NULL) {
         option = 0;
      } else {
         //store reference to current link
         previous = current;
         //move to next link
         current = current->next;
      }
   }

   if(current == head) {
      head = head->next;
   } else {
      current->prev->next = current->next;
   }

   if(current == last) {

      last = current->prev;
   } else {
      current->next->prev = current->prev;
   }
   display();
   option = 0;
}
void modifyList(int code,int new_Code,char new_Name, int new_Age,int new_Phone){
    struct Node* current = head;

		if(isEmpty()){
			printf("***** The List Is Empty *****");
            option = 0;
		}else{
		while(current->code != code){
			if(current->next == NULL){
				printf("Code not Found");
				option =0;
			}else{
				current= current->next;
			}
		}
		current->code=new_Code;
		current->name[10]=new_Name;
		current->age =new_Age;
		current->phone =new_Phone;
		printf("***** List Modified *****");
		display();
		option = 0;
		}
}
void display(){
  struct Node* current = head;
  int i = 0;
    if(isEmpty()){
        printf("*****The List Is Empty*****");
        option=0;
    }
  while(current != NULL){
    puts("\nContact: ");
    printf("Code: %d\n", current->code );
    printf("Name: %s\n", current->name );
    printf("Age:  %d\n", current->age );
    printf("Phone %d\n", current->phone );
    current = current->next;
    i++;
  }
  printf("\n");
}


int main(){
  head = NULL;
	 while(!flag){
	    options();
	    }
  return 0;
}

void menu(){
 puts("");
 puts("***********MENU***********");
 puts("**  1. Insert Register  **");
 puts("**  2. Modify Register  **");
 puts("**  3. Remove           **");
 puts("**  4. Show             **");
 puts("**  5. Exit             **");
 puts("**************************");
}

void options(){

    switch(option){
    case 0:
     menu();
     printf("*Select an Option: ");
     scanf("%i",&option);
    break;

    case 1:
     puts("***1. Insert Register***");

     printf("Insert Code: ");
     scanf("%i",&code);
     printf("Insert Name: ");
     scanf("%s",&name);
     printf("Insert Age: ");
     scanf("%i",&age);
     printf("Insert Phone: ");
     scanf("%i",&phone);
     addBack(code, name, age, phone);
     option = 0;
    break;

    case 2:
       puts("***2. Modify Register***");
       display();
       if(!isEmpty()){
        printf("\nInsert Code to Modify: ");
        scanf("%i",&code);
        printf("Insert New Code: ");
        scanf("%i",&new_Code);
        printf("Insert New Name: ");
        scanf("%s",&new_Name);
        printf("Insert New Age: ");
        scanf("%i",&new_Age);
        printf("Insert New Phone: ");
        scanf("%i",&new_Phone);
        modifyList(code,new_Code,new_Name,new_Age,new_Phone);

       }
    break;

    case 3:
        puts("***3. Remove***");
        if(isEmpty()){
        printf("*****The List Is Empty*****");
        option=0;
        }else{
        printf("Insert Code to Remove: ");
            scanf("%i",&code);
            removeFromList(code);
        }

    break;

    case 4:
        puts("***4. Show List***");
        display();
        option=0;
    break;

    case 5:
        puts("*****Closing Program*****");
        free(new_Code);
        free(new_Name);
        free(new_Age);
        free(new_Phone);
        free(code);
        free(name);
        free(age);
        free(phone);

        flag = true;
    break;

    default:
        puts("*****Insert a Valid Option*****");
        menu();
        option = 0;
    break;
    }

}
