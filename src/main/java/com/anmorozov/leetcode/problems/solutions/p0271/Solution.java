package com.anmorozov.leetcode.problems.solutions.p0271;

import java.util.List;

/**
 * <p><strong>271.</strong> Encode and Decode Strings.</p>
 * <em>Medium</em>
 */
public interface Solution {

    Codec getCodec();

    /**
     * <p>Design an algorithm to encode <b>a list of strings</b> to <b>a string</b>. The encoded string is then sent
     * over the network and is decoded back to the original list of strings.</p>
     *
     * <p>Machine 1 (sender) has the function:</p>
     *
     * <pre>{@code string encode(List<String> strings) {
     *   // ... your code
     *   return encoded_string;
     * }}</pre>
     * <p>Machine 2 (receiver) has the function:</p>
     *
     * <pre>{@code List<String> decode(String s) {
     *   //... your code
     *   return strings;
     * }}</pre>
     *
     * <p>So Machine 1 does:</p>
     *
     * <pre>{@code String encoded_string = encode(strings);}</pre>
     *
     * <p>and Machine 2 does:</p>
     *
     * <pre>{@code List<String> strings2 = decode(encoded_string);}</pre>
     *
     * <p>{@code strings2} in Machine 2 should be the same as {@code strings} in Machine 1.</p>
     *
     * <p>Implement the {@code encode} and {@code decode} methods.</p>
     *
     * <p>You are not allowed to solve the problem using any serialize methods (such as {@code eval}).</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 1 <= strings.length <= 200}</li>
     * 	<li>{@code 0 <= strings[i].length <= 200}</li>
     * 	<li>{@code strings[i]} contains any possible characters out of {@code 256} valid ASCII characters.</li>
     * </ul>
     *
     * @param strings <b>a list of strings</b>
     * @return <b>a list of strings</b>
     */
    default List<String> sendString(List<String> strings) {
        Codec codec = getCodec();
        return codec.decode(codec.encode(strings));
    }
}
