package practice.ch13;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SimplePair <T>{
	private T first;
	private T second;
}
