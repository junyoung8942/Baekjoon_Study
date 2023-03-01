package Silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2751 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 최대힙 트리 만들기
        for(int i = (arr.length/2)-1; i>=0; i--) {
            heapify(arr, i, arr.length);
        }

        // 최대힙이 구성 되어있으므로, 마지막 노드와 루트 노드를 교환
        for(int i=arr.length-1;i>=0;i--) {
            swap(arr, 0, i);

            heapify(arr, 0, i);
        }
        
        
        for(int i : arr) {
            System.out.println(i);
        }
    }

    // 최대힙 만들기
    static void heapify(int arr[], int index, int heapSize) {
        int parent = index;             // 전달받은 노드가 부모 노드로 저장
        int left = 2 * index + 1;  // 왼쪽 자식노드
        int right = 2 * index + 2; // 오른쪽 자식노드

        if(left < heapSize && arr[left] > arr[parent]) {
            parent = left;
        }
        if(right < heapSize && arr[right] > arr[parent]) {
            parent = right;
        }

        if(parent != index) {
            swap(arr, parent, index);

            heapify(arr, parent, heapSize);
        }

    }

    static void swap(int arr[], int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

}
