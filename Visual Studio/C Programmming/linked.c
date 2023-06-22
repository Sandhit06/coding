#include <stdio.h>
#include <malloc.h>
struct Node
{
    int data;
    struct Node *next;
};
void LinkedList(struct Node  *ptr)
{
    while(ptr!=NULL) {
    printf("Element %d\n", ptr->data);
    ptr=ptr->next;
    }
}
int main()
{
    struct Node*head ;
    struct Node*second ;
    head = (struct Node*)malloc(sizeof(struct Node));
    second = (struct Node*)malloc(sizeof(struct Node));
    scanf("%d", &head ->data);
    head -> next = second;
    scanf("%d", &second -> data) ;
    second -> next = NULL;
    LinkedList(head);
    return 0; 
}
/*struct Node
{
    int data ;
    struct Node *next;
};
void push(struct** head_ref, int new_data)
{
    struct Node* new_node = (struct Node*)malloc(sizeof(struct Node));
}
struct node
{
    int data ;
    struct node* left;
    struct node* right;
};
struct Node*CreateNode(int data)
{
    struct node *n;
    n = (struct node *)malloc(sizeof(struct node));
    n->data = 2;
    n->left=NULL;
    n->right=NULL;  
    return n;
}
int main()
{
    struct node *p;
    p = (struct node *)malloc(sizeof(struct node));
    p->data = 2;
    p->left=NULL;
    p->right=NULL;
    struct node *p1;
    p1 = (struct node *)malloc(sizeof(struct node));
    p1->data = 1;
    p1->left=NULL;
    p1->right=NULL;
    struct node *p2;
    p2 = (struct node *)malloc(sizeof(struct node));
    p2->data = 4;
    p2->left=NULL;
    p2->right=NULL;

    p->left=p1;
    p->right=p2;

    return 0;
}
#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};

int main()
{
    struct node *prev,*head,*p;
    int n,i;
    printf ("number of elements:");
    scanf("%d",&n);
    head=NULL;
    for(i=0;i<n;i++)
    {
        p=malloc(sizeof(struct node));
        scanf("%d",&p->data);
        p->next=NULL;
        if(head==NULL)
            head=p;
        else
            prev->next=p;
        prev=p;
    }
    return 0;
}*/